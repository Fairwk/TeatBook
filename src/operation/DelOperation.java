package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOperation{
    @Override
    public void work(BookList booklist){
        System.out.println("删除图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入删除图书的名字: ");
        String name = scanner.nextLine();
        int i = 0;
        for(; i < booklist.getUsedSize(); i++) {
            Book book = booklist.getBook(i);
            if (book.getName().equals(name)) {
                break;
            }
        }
        if(i == booklist.getUsedSize()){
            System.out.println("没有这本书! ");
            return;
        }
        for (int pos = i;pos < booklist.getUsedSize()-1;pos++){
            Book book = booklist.getBook(pos+1);
            booklist.setBook(pos,book);
        }
        booklist.setUsedSize(booklist.getUsedSize()-1);
        System.out.println("删除成功! ");


    }
}
