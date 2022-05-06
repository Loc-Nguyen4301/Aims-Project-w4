public class Aims {
    public static void main(String args[]) {

        Order anOrder1 = new Order();
        // add dvd1
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setDirector("Roger Allers");
        dvd1.setCost(19.95f);
        dvd1.setLength(87);
        anOrder1.addDigitalVideoDisc(dvd1);

        // add dvd2
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction ");
        dvd2.setDirector("Geogre Lucas");
        dvd2.setCost(24.95f);
        dvd2.setLength(124);
        anOrder1.addDigitalVideoDisc(dvd2);

        // add dvd3
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setDirector("John Masker");
        dvd3.setCost(18.99f);
        dvd3.setLength(89);
        anOrder1.addDigitalVideoDisc(dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Tam quoc dien nghia");
        dvd4.setCategory("Tieu Thuyet");
        dvd4.setDirector("La Quan Trung");
        dvd4.setCost(15.00f);
        dvd4.setLength(150);
        anOrder1.addDigitalVideoDisc(dvd4);

        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Tieu Ngao Giang Ho");
        dvd5.setCategory("Kiem Hiep");
        dvd5.setDirector("Kim Dung");
        dvd5.setCost(12.99f);
        dvd5.setLength(89);
        anOrder1.addDigitalVideoDisc(dvd5);

        anOrder1.printListItemOfOrder();

        if (Order.getNumOfInstances() < Order.MAX_LIMITED_ORDERS) {
            Order anOrder2 = new Order();

            DigitalVideoDisc dvd6 = new DigitalVideoDisc("Anh Hung Xa Dieu");
            dvd6.setCategory("Kiem Hiep");
            dvd6.setDirector("Kim Dung");
            dvd6.setCost(27.99f);
            dvd6.setLength(89);
            anOrder2.addDigitalVideoDisc(dvd6);

            DigitalVideoDisc dvd7 = new DigitalVideoDisc("Than Dieu Dai Hiep");
            dvd7.setCategory("Kiem Hiep");
            dvd7.setDirector("Kim Dung");
            dvd7.setCost(87.99f);
            dvd7.setLength(89);
            anOrder2.addDigitalVideoDisc(dvd7);

            DigitalVideoDisc dvd8 = new DigitalVideoDisc("Bich Huyet Kiem");
            dvd8.setCategory("Kiem Hiep");
            dvd8.setDirector("Kim Dung");
            dvd8.setCost(38.99f);
            dvd8.setLength(89);
            anOrder2.addDigitalVideoDisc(dvd8);

            DigitalVideoDisc dvd9 = new DigitalVideoDisc("Thien Long Bat Bo");
            dvd9.setCategory("Kiem Hiep");
            dvd9.setDirector("Kim Dung");
            dvd9.setCost(92.99f);
            dvd9.setLength(89);
            anOrder2.addDigitalVideoDisc(dvd9);

            DigitalVideoDisc dvd10 = new DigitalVideoDisc("Xuan Thu-Chien Quoc");
            dvd10.setCategory("Lich Su");
            dvd10.setDirector("Phung Mong Long");
            dvd10.setCost(110.10f);
            dvd10.setLength(89);
            anOrder2.addDigitalVideoDisc(dvd10);

            anOrder2.printListItemOfOrder();
        }
        else{
            System.out.println("Can't add order");
        }
    }
}
