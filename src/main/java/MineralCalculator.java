class Gold extends MineralCalculator {
    int Price = 100;
        Gold() {
            this.price = Price;

        }
    }

class Silver extends MineralCalculator {
    int Price = 90;
    Silver() {
        this.price = Price;

    }
}

class Bronze extends MineralCalculator {
    int Price = 80;
    Bronze() {
        this.price = Price;

    }
}


public class MineralCalculator {
    int value;
    int price;

    void add(MineralCalculator mineralCalculator) {
        this.value += mineralCalculator.price;

    }

    public int getValue() {
        return this.value;
    }

}

