/*
 * 제네릭 : 멀티타입 파라미터
 * class<A, B, C, ... >
 */
package section03.product;

public class Product<K, M> {
	private K kind;
	private M model;

	public Product() {}
	public Product(K kind, M model) {
		this.kind = kind;
		this.model = model;
	}

	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
	

}