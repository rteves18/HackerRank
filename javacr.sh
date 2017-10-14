#!/bin/bash

if [ $# -ne 0 ]
   then
	cat << EOF

Compile & Run the last modified Java file

Important: Be sure to be in the current
	   working directory of the file
	   that you wish to compile and run.

Usage: javacr.sh

EOF
exit 0
fi


lastModFile="$(find . -type f -maxdepth 1 -name "*.java" -print0 | xargs -0 stat -f "%m %N" |
sort -rn | head -1 | cut -f2- -d" ")"
file=${lastModFile#"./"}

if [[ $file == *.java ]]; then
	
	filename=${file%%.*} 
	echo "Compiling $filename ..."; javac $file 
	echo "Running $file ..."; 	java $filename
else
	cat << EOF
Error: Could not find Java file in
       current working directory.
EOF
fi


