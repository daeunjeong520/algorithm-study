package baekjoon.string;

import java.io.*;

/**
 * 문자열
 */
public class Test9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++) {
            String[] strArr = br.readLine().split("");

            if(strArr.length == 1) {
                bw.write(strArr[0] + strArr[0] + "\n");
            }else if(strArr.length == 2){
                bw.write(strArr[0] + strArr[1] + "\n");
            }else {
                bw.write(strArr[0] + strArr[strArr.length - 1] + "\n");
            }
        }
        bw.close();
    }
}
