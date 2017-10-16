#!/bin/bash

specific_file() {
	echo "Compiling $file ..."; 	javac $file
	echo "Running $filename ...";   java $filename
}

last_modified() {
	lastModFile="$(find . -type f -maxdepth 1 -name "*.java" -print0 | xargs -0 stat -f "%m %N" |
	sort -rn | head -1 | cut -f2- -d" ")"
	file=${lastModFile#"./"}

	if [[ $file == *.java ]]; then
	
		filename=${file%%.*} 
		echo "Compiling $file ..."; javac $file 
		echo "Running $filename ..."; 	java $filename
	else
		cat << EOF
Error: Could not find Java file in
       current working directory.
EOF
fi
}

usage() {
cat << EOF

Compile & Run the last modified Java file
Or specify a particular Java file

Important: Be sure to be in the current
	   working directory of the file
	   that you wish to compile and run.

Usage: javacr.sh [file.java]

EOF
exit 0
}

if [ $# -eq 0 ]
   then
	last_modified
elif [ $# -eq 1 ]
   then
	file=$1
	filename=${file%%.*}
	specific_file
else
   	usage
fi



