public class TestSiswa {
    public static void main(String[] args) {
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Nahda");
        siswa.setAbsen(26);
        siswa.setAddress("Tulungagung");
        
        System.out.println("Name : " + siswa.getName());
        System.out.println("Absen : " + siswa.getAbsen());
        System.out.println("Address : " + siswa.getAddress());
    }
}
