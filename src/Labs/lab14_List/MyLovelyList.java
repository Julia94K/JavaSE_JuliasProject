package Labs.lab14_List;
//Односвязный список
//        1) Реализовать класс Element && класс List для хранения данных типа int.
//        2) в классе List реализовать метод addElement() - добавление элемента в начало списка.
//        3) в классе List реализовать метод getSize () - возвращает размер списка. Нужно сделать так,
//        чтобы при вызове этого метода он возвращал одно закешированное значение.
//        Не нужно чтобы метод проходил по всему списку.
//        4) в классе List реализовать метод remove() - удаление первого элемента списка и возвращение
//        этого значения в качестве результата работы метода.
//        Проверить работу этого метода в совокупности с методом add()
//        Запрещено использовать массивы и другие коллекции объектов.
public class MyLovelyList {
    Element head = null;


    public int getListSize(){
        int count = 0;
        Element t = head;
        while (t!= null){
            t = t.element;
            count ++;
        }
        return count;
    }
    public void addToList (Element newElement){
        newElement.element=head;
        head=newElement;
    }
    public void showList (){
        Element t = head;
        while (t != null){
            System.out.println(t.value);
            t=t.element;
        }
    }
    public void remove(){
        Element firstElement = head;
        head = firstElement.element;
        System.out.println("Мы удалили "+firstElement.value);


    }

    public static void main(String[] args) {
        MyLovelyList myList = new MyLovelyList();
        myList.addToList(new Element(101));//сначала добавляем 3й элемент
        myList.addToList(new Element(202));//теперь добавляем 2й элемент
        myList.addToList(new Element(103));//теперь 1й
        myList.showList();
        System.out.println(myList.getListSize());
        myList.remove();//удаляет 1й элемент
        System.out.println("Остались следующие элементы:");
        myList.showList();

    }

}
