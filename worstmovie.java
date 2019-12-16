public class worstmovie{
    public static void main(String[]args){
        int[][] textMatrix = {{ 8,8,8},
                {6,6,6},
                {1,5,10}};

        System.out.println(hardestRater2018(textMatrix));

    }

    public static int hardestRater2018(int[][] ratings){
        int sum = 0;
        int hor = ratings.length;
        int ver = ratings[0].length;
        int min = hor*10;
        int rater = 0;
        for(int i = 0; i< ver; i++){
            sum = 0;
            for(int j = 0; j< hor; j++){
                sum += ratings[i][j];
            }
            if(sum<min){
                min = sum;
            }
        }
        return min/(hor);

    }
}