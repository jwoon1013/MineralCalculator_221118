class Gold extends MineralCalculator {
        int price = 100; // 이거.. 아니야...? 웨않돼지...
    }

}

class Silver extends MineralCalculator {
    int price = 80;
}

class Bronze extends MineralCalculator {
    int price = 70;
}


public class MineralCalculator {
    int value;
    int price;

    void add(MineralCalculator mineralCalculator) {
        this.value += price;

    }

    public int getValue() {
        return this.value;
    }

}

