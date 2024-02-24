package lesson10;

public class LoanIssuer {
    private String name;
    private boolean isLazy;
    private boolean isKind;
    public boolean issue (LoanTaker taker){
        if (isLazy && taker.getAnnualSalary() > 20000){
            return true;
        } else if (!isLazy  && isKind &&
                taker.getAnnualSalary() > 25000 && taker.getAge()< 60) {
            return true;
        } else if (!isLazy && !isKind &&
                taker.getAnnualSalary() > 30000 && taker.getAge()< 50) {
        }
        return false;
    }

    public LoanIssuer(String name, boolean isLazy, boolean isKind) {
        this.name = name;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLazy() {
        return isLazy;
    }

    public void setLazy(boolean lazy) {
        isLazy = lazy;
    }

    public boolean isKind() {
        return isKind;
    }

    public void setKind(boolean kind) {
        isKind = kind;
    }
}
