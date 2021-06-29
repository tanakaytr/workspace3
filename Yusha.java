public class Yusha extends Player{
	public Yusha(String name) {
		super(name);
	}
	public String getName() {
		return "勇者：" + this.name;
	}
	public void fight(){
		System.out.println(this.getName() + "：力強く戦った、といった");
	}
	public void run() {
		 System.out.println(this.getName() + ":撤退した");
	}
	public void useMagic() {
		System.out.println(this.getName() + "：簡単な魔法を使った");
	}
	public void useTool() {
		System.out.println(this.getName() + "：攻撃力を上げる道具を使った");
	}
}