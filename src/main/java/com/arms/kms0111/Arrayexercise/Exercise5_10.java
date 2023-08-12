package com.arms.kms0111.Arrayexercise;

class Exercise5_10 {
    public static void main(String[] args) {
        char[] abcCode =
                { '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'};
        char[] numCode = {'q','w','e','r','t','y','u','i','o','p'};
        String src = "abc123";
        String result = "";
        for(int i=0; i < src.length();i++) {
            char ch = src.charAt(i);
            if(ch >= '0' && ch <= '9'){
                for(int j=0;j < numCode.length;i++){
                    if(ch == numCode[j]){
                        result += numCode[j];
                    }
                }
            }else {
                for(int k =0;k<abcCode.length;k++){
                    if(ch ==abcCode[k]){
                        result+= abcCode[k];
                    }
                }
            }
        }

        System.out.println("src:"+src);
        System.out.println("result:"+result);
    } // end of main
} // end of class
