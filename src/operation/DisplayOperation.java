package operation;

import book.Book;
import book.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList booklist){
        System.out.println("显示图书");
        for(int i = 0; i < booklist.getUsedSize(); i++){
            Book book = booklist.getBook(i);
            System.out.println(book);
        }

    }
}
