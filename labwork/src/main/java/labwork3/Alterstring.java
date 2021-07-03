package labwork3;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Alterstring {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine().toLowerCase();
		System.out.println(str.toCharArray());
		System.out.println(alterstring(str.toCharArray()));
		

	}

	private static String alterstring(char[] str) {
		// TODO Auto-generated method stub
		for(int i=0;i<str.length;i++) {
			if (str[i]=='z') {
				str[i]='b';
			}
			else {
				if(!isVowel(str[i])) {
					str[i]=(char)(str[i]+1);
					if(isVowel(str[i])) {
						str[i]=(char)(str[i]+1);
					}
				}
			}
		}
		return String.valueOf(str);
	}

	private static boolean isVowel(char c) {
		// TODO Auto-generated method stub
		if (c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u') {
			return false;
		}
		return true;
	}

}
