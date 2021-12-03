import java.util.ArrayList;
import java.util.*;

abstract class Bicycles {
    abstract void buying();//покупка

    abstract void repairing();//починка

    abstract void usage();//юзабельность

    abstract void assembling();//сборка
}



class Unicycle extends Bicycles  {//одноколёсные

    @Override
    void buying() {
        System.out.println("Вы купили велосипед, да не простой а одноколёсный");
    }

    @Override
    void repairing() {
        System.out.println("Жик-жик -готово; всегда бы так легко работать, как с одноколёсными");
    }

    @Override
    void usage() {
        System.out.println("Могут использовать только трюкачи и люди хорошо умеющие держать вертикальный баланс");
    }

    @Override
    void assembling() {
        System.out.println("Наденьте на ось седло, цепь, колесо, втулку на ось и колесо на неё - готово");
    }


}

class Twowheeled extends Bicycles {//двухколёсные

    @Override
    void buying() {
        System.out.println("Вы купили велосипед");
    }

    @Override
    void repairing() {
        System.out.println("Поменяли проколотую камеру, поставили новые тормоза и передачи");
    }

    @Override
    void usage() {
        System.out.println("Могут использовать и дети и взрослые люди");
    }

    @Override
    void assembling() {
        System.out.println("Чаще всего собираются на заводе, но можете купить под ваш рост раму, докупить детали и сами всё это собрать");
    }

}

class Tricycle extends Bicycles {//трёхколёсные

    @Override
    void buying() {
        System.out.println("Вы купили велосипед");
    }

    @Override
    void repairing() {
        System.out.println("Заменили подшипники в задней оси, поставили звонок на руль");
    }

    @Override
    void usage() {
        System.out.println("созданы для детей до 7 лет");
    }

    @Override
    void assembling() {
        System.out.println("Собираются с душой для маленьких детей");
    }


}


public class Main2 {
    public static void main(String[] args) {
        ArrayList<Bicycles> list = new ArrayList<>();
        Bicycles n1 = new Unicycle();
        Bicycles n2 = new Twowheeled();
        Bicycles n3 = new Tricycle();
        list.add(n1);
        list.add(n2);
        list.add(n3);
        for (Bicycles bicycles : list) {
            bicycles.buying();
            bicycles.repairing();
            bicycles.usage();
            bicycles.assembling();
            System.out.println("________________________________________________________");
        }
    }
}



