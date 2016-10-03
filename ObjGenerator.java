/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objgenerator;

/**
 *
 * @author kmhasan
 */
public class ObjGenerator {

    public ObjGenerator() {
        int n = 8;
        double r = 1.0;
        double h = 2.0;
        int [] a1 = new int[n];
        int [] a2 = new int[n];
        int index1 = 0;
        int index2 = 0;
        System.out.printf("o Prism\n");
        for (int i = 0; i < n; i++) {
            double x;
            double y;
            double z;
            double theta = -(2 * Math.PI / n * i);
            x = r * Math.cos(theta);
            y = r * Math.sin(theta);
            z = 0;
            System.out.printf("v %.3f %.3f %.3f\n", x, y, z);
        }

        for (int i = 0; i < n; i++) {
            double x;
            double y;
            double z;
            double theta = 2 * Math.PI / n * i;
            x = r * Math.cos(theta);
            y = r * Math.sin(theta);
            z = h;
            System.out.printf("v %.3f %.3f %.3f\n", x, y, z);
        }
        
//        System.out.printf("f");
        int i;
        for (i = 1; i <= n; i++){
            //System.out.printf(" %d", i);
            a1[index1] = i;
            index1++;
        //System.out.println();
        }
        
        
        int j;
        for (j = n + 1; j <= 2 * n; j++){
            //System.out.printf(" %d", j);
            a2[index2]=j;
            index2++;
        //System.out.println();
        }
        
        System.out.printf("f");
        for(int a=0; a<a1.length;a++){
            System.out.printf(" %d", a1[a]);
        }
        System.out.println();
        
        int l=0;
        int m=1;
        int p;
        int o = n-1;
        for (int k = 1; k <= n; k++){
            
            if(m==n && o==0){
                m=0;
                p=n-1;
                l=o+1;
                o =0;
                System.out.printf("f");
                System.out.printf(" %d %d %d %d", a1[m],a1[p],a2[l],a2[o]);
            }else{
                System.out.printf("f");
                System.out.printf(" %d %d %d %d", a1[m],a1[m-1],a2[l],a2[o]);
                m++;
                l=o;
                o--;
            }
            System.out.println();
        }
        
        System.out.printf("f");
        for(int b=0; b<a2.length;b++){
            System.out.printf(" %d", a2[b]);
        }
        System.out.println();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ObjGenerator();
    }
    
}
