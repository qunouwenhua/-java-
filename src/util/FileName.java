package util;

import java.io.File;

public class FileName {

	public static void main(String[] args) {
		File file=new File("E://apache-maven-3.5.0-bin.tar.gz");
		String fileName=file.getName();
		String[] aa=fileName.split("\\.");
		System.out.println(aa[aa.length-2]+"."+aa[aa.length-1]);
	}
}
