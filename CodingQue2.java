package InterviewQ;

public class CodingQue2 {
    public static void main(String args[]){
        int a[] = {7,4,8,2,9,4,6};
        int count = 1;
        int max = a[0];
        for(int i=1;i<=a.length-1;i++){
            if(a[i]>max){
                count++;
                max = a[i];
            }
        }
        System.out.println(count);
    }
}
