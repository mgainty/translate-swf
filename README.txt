-----------------
  Translate SWF
-----------------
The Translate is a compiler for Macromedia's ActionScript language, Version 1.0.

-------------
  Licensing
-------------
Translate SWF is made available under the terms of the Berkeley Software
Distribution (BSD) license. This allow you complete freedom to use and
distribute the code in source and/or binary form as long as you respect
the original copyright. Please see the LICENSE.txt file for exact terms.

The class libraries shipped with Translate each have their own licence. For more
details please see the 'Libraries' section below.

----------------
  Requirements
----------------
To use Translate SWF you must have at least:

    Java 6 Standard Edition

--------------------------
  Building the Compiler
--------------------------
The ANT build file, build.xml contains the following major targets:

    build   compile with optimisation all the classes and package them
            in translate.jar.

Minor targets provide more control over the compiling and packaging
of classes, allowing for example a JAR file to be created containing
the framework classes and the examples. Targets include:

    clean    remove all the compiled classes and jars.
    grammar  regenerate the java classes from the ActionScript grammar. 
    classes  compile the framework classes for production.
    debug    compile the framework classes for development.
    jar      package all the compiled classes in a JAR.

------------------------
  Testing the Compiler
------------------------
Translate comes with code to test the compiler with a reference suite of 
ActionScript code. 

The ActionScript code samples passed to the compiler can be found in the 
directory src/test/resources/as1. Each file implements a specific subset of the 
ActionScript language, e.g. literals, Number class methods, binary operators, 
etc.

There are also three Flash files, Button.fla, Frame.fla and MovieClip.fla. The
ActionScript code are #included in each file so the code can be part of a 
complete Flash movie. This allows the code generated by Translate to be compared
against the code generated by Adobe's authoring tool.

IMPORTANT: Most of the files are identical to the code generated by Adobe
Flash. However a few are not byte-for-byte comparable. When finding any 
differences it is important that the differences may still be logically 
equivalent. For more information contact Flagstone, see Additional Information
at the end of this note.

-------------
  Libraries
-------------
Translate SWF is distributed with the following libraries:

    * JavaCC https://javacc.dev.java.net/
    * JUnit, http://www.junit.org/
    
JavaCC is used to generate the classes from the ActionScript grammar that are 
used to constructor the compiler.

JUnit is used to run the test suites that are used to verify that the code 
generated by Translate is compatible with code generated by Adobe's Flash
editor.

These libraries are not covered by the licence associated with Translate. 
Details of the licence terms are listed below:

----------
  JavaCC 
----------
Copyright (c) 2003 Sun Microsystems, Inc. All  Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

-Redistribution of source code must retain the above copyright notice, this  list 
of conditions and the following disclaimer.

-Redistribution in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation and/or 
other materials provided with the distribution.

Neither the name of Sun Microsystems, Inc. or the names of contributors may 
be used to endorse or promote products derived from this software without 
specific prior written permission.

This software is provided "AS IS," without a warranty of any kind. ALL EXPRESS 
OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES, INCLUDING ANY IMPLIED 
WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, 
ARE HEREBY EXCLUDED. SUN MIDROSYSTEMS, INC. ("SUN") AND ITS LICENSORS SHALL NOT 
BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING 
OR DISTRIBUTING THIS SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL SUN OR ITS 
LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT, INDIRECT, 
SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER CAUSED AND 
REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF OR INABILITY TO 
USE THIS SOFTWARE, EVEN IF SUN HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.

You acknowledge that  this software is not designed, licensed or intended for 
use in the design, construction, operation or maintenance of any nuclear facility.


--------------------------
  Additional Information
--------------------------

For Further Information please contact:

Stuart MacKay

Flagstone Software Ltd.
92 High Street
Wick, Caithness KW1 4LY
Scotland

www.flagstonesoftware.com

