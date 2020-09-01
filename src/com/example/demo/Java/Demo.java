package com.example.demo.Java;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

    	// Tạo đối tượng cho Categorry
        List<Category> listCategory = new ArrayList<>();
        // Tạo dữu liệu cho Categorry
        listCategory.add(new Category("may tinh", "mt"));
        listCategory.add(new Category("dien lanh", "dl"));

        // Tạo đối tượng cho Product
        List<Product> listProduct  = new ArrayList<>();

        // Tạo đữ liệu cho Product
        listProduct.add(new Product("may tinh xach tay A","mt",12));
        listProduct.add(new Product("laptop B","mt",19));
        listProduct.add(new Product("PC C","mt",21));
        listProduct.add(new Product("MaC D","mt",121));

        listProduct.add(new Product("Tu lanh A","dl",58));
        listProduct.add(new Product("Dieu Hoa B","dl",34));


        Scanner sc = new Scanner(System.in) ; // tạo lệnh truyền dữ liệu
        System.out.println("Nhập yêu cầu truy vấn dữ liệu(tag)!!! :");
        String s = sc.nextLine(); // nhập tag ;
        int arrayPrice [] = new int[listProduct.size()];
        String arrayName [] = new String[listProduct.size()];
        if (s.equals("mt")){
            int count = 0;
            for (Product exProduct : listProduct) {
                if (exProduct.getTag().equals(s)) {
                    arrayPrice[count] = exProduct.getPrice();
                    arrayName[count] = exProduct.getName();
                    count = count +1;
                }
            }
            sortDESC(arrayPrice,arrayName);
            showProduct(arrayPrice,arrayName);
        }
        else if(s.equals("dl")){
            int count = 0;
            for (Product exProduct : listProduct) {
                if (exProduct.getTag().equals(s)) {
                    arrayPrice[count] = exProduct.getPrice();
                    arrayName[count] = exProduct.getName();
                    count++;
                }
            }
            sortDESC(arrayPrice,arrayName);
            showProduct(arrayPrice,arrayName);
        }
        else {
            System.out.println("Nhập Thất bại!!!");
        }
        }

    public static void sortDESC(int [] arrP,String []arrN) {
        int temp = arrP[0];
        String temp2 = arrN[0];
        for (int i = 0 ; i < arrP.length - 1; i++) {
            for (int j = i + 1; j < arrP.length; j++) {
                if ( arrP[i] < arrP[j]) {
                    temp = arrP[j];
                    temp2 = arrN[j];
                    arrP[j] = arrP[i];
                    arrN[j] = arrN[i];
                    arrN[i] = temp2;
                    arrP[i] = temp;
                }
            }
        }
    }
    public static void showProduct(int [] arrP,String [] arrN) {
        for (int i = 0; i < arrP.length; i++) {
            if (arrN[i] != null) {
            	System.out.println("Tên sản phẩm:_" + arrN[i]);
                System.out.println("Giá sản phẩm:_" + arrP[i]);
                System.out.println("------+-------");
            }
        }
    }


    }



