var types = new Array("button", "movieclip", "frame");
var rootDir = "file:///.";
var profiles = FLfile.listFolder(rootDir, "directories");

var publishProfile;
var flashFile;
var scriptDir;

for (profile in profiles) {
    for (type in types) {
        flashFile = rootDir + "/" + types[type] + ".fla";
        scriptDir = rootDir + "/" + profiles[profile] + "/" + types[type];
        publishProfile = rootDir + "/" + profiles[profile] + "/publish.xml";
        
        var doc = fl.openDocument(flashFile);
        doc.importPublishProfile(publishProfile);
        doc.currentPublishProfile = "compile";

        var fileMask = ".as";
        var files = new Array();

        listFiles(scriptDir, fileMask, files);

        var script;
        var dirOut;
        var fileOut;

        for (i in files) {
            script = files[i].substring(rootDir.length + 1);
            fl.actionsPanel.setText("#include \"" + script + "\"");
            fileOut = script.slice(0, -fileMask.length) + ".swf";
            dirOut = "file:///" + fileOut.substring(0, fileOut.lastIndexOf("/"));
            if (!FLfile.exists(dirOut)){
                FLfile.createFolder(dirOut);
            }
            doc.exportSWF("file:///" + fileOut, true);
        }

        doc.revert();
        doc.close();
    }
}

//fl.quit();

function listFiles(dir, mask, files) {
	var list = FLfile.listFolder(dir);
	var path;
	var attr;
	
	for (i in list) {
	    path = dir + "/" + list[i];
		if (FLfile.exists(path)){
			attr = FLfile.getAttributes(path);
			if (attr && (attr.indexOf("D") != -1)) {
				listFiles(path, mask, files);
			} else {
			    if (path.slice(-mask.length) == mask) {
					files.push(path);
				}
			}
		}
	}
}


