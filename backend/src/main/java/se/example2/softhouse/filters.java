package se.example2.softhouse;

/**
 * Created by rohithvajhala on 03-10-2016.
 */
public class filters {
    public  double[] lpf_coeff = new double[]{ -0.0022,-0.0026,-0.0033,-0.0030,0.0000,0.0075,0.0207,0.0396,0.0626,0.0866,0.1078,0.1224,0.1276,0.1224,0.1078,0.0866,0.0626,0.0396,0.0207,0.0075,0.0000,-0.0030,-0.0033,-0.0026,-0.0022};
    public double[] hpf_coeff=new double[] {0.0021,   -0.0011,   -0.0032,    0.0070,   -0.0000,   -0.0176,    0.0202,    0.0160,   -0.0611,    0.0351,0.1054,-0.2889,    0.3742,   -0.2889,    0.1054,    0.0351,   -0.0611,   0.0160,    0.0202,   -0.0176,   -0.0000, 0.0070,-0.0032,   -0.0011,    0.0021};

    public filters() {

    }

    public double[] lpf(double[] a)
    {
        int i,j;
        double[] out = new double[]{};
        int s=a.length;
        for(i=0;i<25;i++)
        {
         for (j=0;j<=i;j++)
         {
             out [j]=a[j]*lpf_coeff[i-j]+out[i];
         }
        }
        return out;
    }
    public double[] hpf(double[] a)
    {
        int i,j;
        double[] out = new double[]{};
        int s=a.length;
        for(i=0;i<25;i++)
        {
            for (j=0;j<=i;j++)
            {
                out [j]=a[j]*hpf_coeff[i-j]+out[i];
            }
        }
        return out;
    }

}
