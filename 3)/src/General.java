public class General<T,S> {
    private T t;
    private S s;
    public General(T t, S s) {
        this.t = t;
        this.s = s;
    }
    public T getT() {
        return t;
    }
    public S getS() {
        return s;
    }
    public void setS(S s) {
        this.s = s;
    }
    public void setT(T t) {
        this.t = t;
    }
    public void print() {
        System.out.println(t);
        System.out.println(s);
    }
}
