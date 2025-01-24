package InterviewQ;
class CodingQue1 {
    public static void main(String rags[]){
        String s = "h#e*#*l#lo";
        int starCount = 0,hashCount=0;
        for(int i = 0;i<=s.length()-1;i++){
            if(s.charAt(i)=='*'){
                starCount++;
            }else if(s.charAt(i)=='#'){
                hashCount++;
            }
        }
        System.out.println(starCount - hashCount);
    }   
}
