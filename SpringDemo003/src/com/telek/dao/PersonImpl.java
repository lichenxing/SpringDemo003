/**
 * 
 */
package com.telek.dao;

/**
 * @author Administrator
 *
 */
public class PersonImpl implements Person {

	

	/* (non-Javadoc)
	 * @see com.telek.dao.Person#useAxe()
	 */
	private Axe axe;
	//����ע������Ĵ������Ĺ�����
	public PersonImpl(Axe axe) {
		this.axe = axe;
	}

	@Override
	public void useAxe() {
		 System.out.println(axe.chop());
	}


	

	
}
