#!/bin/bash

if [ $# -ne 1 ]
  then
    echo "Usage: javatemp.java [filename]"
fi

touch $1.java
cat > $1.java << EOF
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class $1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    }
}
EOF
