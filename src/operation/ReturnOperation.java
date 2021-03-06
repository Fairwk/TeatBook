package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList booklist){
        System.out.println("归还图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入归还图书的名字: ");
        String name = scanner.nextLine();
        for(int i = 0; i < booklist.getUsedSize(); i++){
            Book book = booklist.getBook(i);
            if(book.getName().equals(name)){
                book.setBorrowed(false);
                System.out.println("归还成功! ");
                return;
            }

        }
        System.out.println("没有你要归还的那本书! ");

    }
}
