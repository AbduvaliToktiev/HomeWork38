import java.util.*;

// Публичный класс Main
public class Main { // Тело класса
    // Основной метод класса
    public static void main(String[] args) { // Тело метода
        HashSet<Dog> dalmatian = new HashSet<>(); // Множество для заполнения
        // Цикл для создания 40 долматинцев
        for (int i = 0; i <= 40; i++) { // Тело цикла
            Dog dogs = new Dog("Dalmatian" + i, i); // Создание объектов
            dalmatian.add(dogs); // Добавление долматинцев во множество
        } // Закрывает тело цикла
        System.out.println(dalmatian); // Вывод множества в консоль
        // Проходится по списку и ищет сходчтво по имени если нет вернёт null
        Dog dalmatianChoice = dalmatian.stream().filter(dog -> "Dalmatian20".equals(dog.getName())).findAny().orElse(null);
        System.out.println("Мои характеристики: " + dalmatianChoice); // Вывод долматинца в консоль если такой есть
    } // Закрывает тело метода
} // Закрывает тело класса

