import java.util.*;
//skype matilde.pato
public class SpireGraph {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    do {
      int i = 0;
      int[] height_vals = new int [10];
      int vals_sum = 0;
      int max = 0;
      int num_t = 0;
      int x_axis, y_axis, height, center;

      System.out.print("Sequência ? ");

      do {

        //int in_height = in.nextInt();
        height_vals[i] = in.nextInt();
        //if (in_height < 0 || in_height > 15 || vals_sum > 30)
        if (height_vals[i] < 0 || height_vals[i] > 15 || vals_sum > 30) {
          num_t = i;
          break;
        }
        for (int a = 0; a < height_vals.length ; a++) {
          vals_sum += height_vals[a];
          if (height_vals[a] > max) max = height_vals[a];
        }
        i++;
        //System.out.print(i + "->");
      } while (i < 10);

      System.out.println(max + Arrays.toString(height_vals));
      x_axis = 0;
      /* height = height_vals[z];
      x_axis = (height * 2) + 3;
      y_axis = height + 3; */
      for (int p = 0; p < num_t; p++) {
        height = height_vals[p];
        y_axis = (max + 3);
        x_axis = (height * 2 + 3) * num_t;
        for (int y = 0; y < y_axis ; y++ ) {
          if (height_vals[0] > 15) break;
          System.out.print(y + ".");
          for (int x = 0; x < x_axis ; x++ ) {
            System.out.print(x + " ");
          }
          System.out.println("");
        }
      }
    } while (true);

    //System.out.println(Arrays.toString(trig));
  }
}
