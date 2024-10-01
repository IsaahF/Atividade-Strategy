package Strategy;

public class Disciplina {
	private ICalcMedia calcMedia;
	private double media;
	private String nome;
	private double P1;
	private double P2;
	
	
	public void setNome(String nm) {
		this.nome = nm;
	}
	
	public void setP1(double p1) {
		this.P1 = p1;
	}
	
	public void setP2(double p2) {
		this.P2 = p2;
	}
	
	public double getMedia() {
		return media;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getP1() {
		return P1;
	}
	
	public double getP2() {
		return P2;
	}
	
	public String getSituacao() {
		return calcMedia.Situacao(media);
	}
	
	public void CalcularMedia() {
		this.media = calcMedia.CalculaMedia(P1, P2);		
	}
	
	Disciplina(){
	}
	
	
	Disciplina(ICalcMedia calcMedia){
		this.calcMedia = calcMedia;
	}
}
