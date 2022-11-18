// 문제 : 현재 광물을 추가할 때 마다 add 메서드를 추가해야하는 단점이 있는 코드.
// MineralCalculator 클래스의 add 메서드 추가하지 않는 방법을 생각해서, 코드를 수정하기.

class Gold {
}

class Silver {
}

class Bronze {
}

class MineralCalculator {
    int value = 0;

    public void add(Gold gold) {
        this.value += 100;
    }

    public void add(Silver silver) {
        this.value += 90;
    }

    public void add(Bronze bronze) {
        this.value += 80;
    }

    public int getValue() {
        return this.value;
    }
}