import java.io.File;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;

public class formatUrlMap {
	public static void main(String[] args) {
		File file=new File("E://apache-maven-3.5.0-bin.tar.gz");
		String fileName=file.getName();
		String[] aa=fileName.split(".");
		System.out.println(aa[aa.length]);
	}

}
