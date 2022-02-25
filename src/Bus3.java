public class Bus3 {
    private double penumpang;
    private double maxpenumpang;
    private double penumpangbaru;
    private double counter;
        //konstruksi kelas Bus
    public Bus3(double maxpenumpang)
    {
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //Method Mutator
    public void addpenumpang(double penumpang)
    {
        double temp;
        temp = this.penumpang+penumpang;
        if (temp> maxpenumpang)
        {
            System.out.println("penumpang melebihi kuota");
        }
        else
        {
            this.penumpang=temp;
            counter++;
        }
    }
     public void getpenumpang(double password)
     {
         if (password==24)
         {
             System.out.println("Password benar");
         }
         else
         {
             System.out.println("Password salah");
         }
     }
     public double getAverage(){
         return penumpang/counter;
     }
     public void cetakpenumpang()
     {
         System.out.println("penumpang Bus sekarang = "+penumpang);
         System.out.println("Maksimum penumpang yang seharusnya adalah = "+maxpenumpang);
     }
}
 