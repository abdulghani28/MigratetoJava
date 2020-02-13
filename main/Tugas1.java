import java.util.Scanner;
class Tugas1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int x, max=0, min=0, total=0, len=0;
        float avg;
        int [] i= new int[100];

        System.out.print("Nama : ");
        nama = input.nextLine();
        System.out.print("Berapa nilai yang diinputkan ? : ");
        x = input.nextInt();
        for (int j = 0; j < x; j++) {
            System.out.print("Nilai ke-"+(j+1)+" : ");
            i[j]=input.nextInt();
            total=total+i[j];
            if (max<i[j]) {
                max=i[j];
            }
            if (min==0) {
                min=i[j];
            }
            else if(min>i[j]){
                min=i[j];
            }
            len++;
        }
        avg=total/len;
        System.out.println("Nama : "+ nama);
        System.out.println("Nilai Tertinggi : "+ max);
        System.out.println("Nilai Terendah : "+ min);
        System.out.println("Rata-rata : "+ avg);
    }
}