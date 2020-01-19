package stringStuffs;
// this is interview question from coderbyte
public class StarRating {
    public static void main(String []args){
        System.out.println("Hello World");
        System.out.println("Result is === " + starRating("0.1"));
    }

    public static String starRating(String str){
        double d = Math.round(Double.parseDouble(str)*2)/2.0;
        StringBuilder stb = new StringBuilder();
        int count = 5;
        while(count > 0){
            if(d <= 0.0){
                stb.append("empty").append(" ");
            }else if(d > 0 && d < 1){
                stb.append("half").append(" ");
                d -= d;
            } else if(d >= 1){
                stb.append("full").append(" ");
                d -= 1;
            }
            count --;
        }
        return stb.toString();
    }
}
