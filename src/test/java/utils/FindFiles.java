package utils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.List;

public class FindFiles {

	public static FilenameFilter getFilter(final String extension) {
		return new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				boolean accept = false;

				File file = new File(dir, name);

				if (name.endsWith(extension)) {
					accept = true;
				} else if (file.isDirectory() && name.equals("..") == false
						&& name.equals(".") == false) {
					accept = true;
				}
				return accept;
			}
		};
	}

    public static void findFiles(List<String> list, File directory,
			FilenameFilter filter) {
		String[] files = directory.list(filter);

		for (int i = 0; i < files.length; i++) {
			File file = new File(directory, files[i]);

			if (file.isDirectory()) {
				findFiles(list, file, filter);
			} else {
				list.add(file.getPath());
			}
		}
	}
}
