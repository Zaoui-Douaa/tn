package tn.tuniprob.gestionmagasin.GestMall;
public  class Mall{

    String m_sMall  ;
    int    m_id ;
    String m_sVille ;
    int  m_inbEtages ;

    public Mall(String m_sMall, int m_id, String m_sVille, int m_inbEtages) {
        this.m_sMall = m_sMall;
        this.m_id = m_id;
        this.m_sVille = m_sVille;
        this.m_inbEtages = m_inbEtages;
    }

    public String getM_sMall() {
        return m_sMall;
    }

    public void setM_sMall(String m_sMall) {
        this.m_sMall = m_sMall;
    }

    public int getM_id() {
        return m_id;
    }

    public void setM_id(int m_id) {
        this.m_id = m_id;
    }

    public String getM_sVille() {
        return m_sVille;
    }

    public void setM_sVille(String m_sVille) {
        this.m_sVille = m_sVille;
    }

    public int getM_inbEtages() {
        return m_inbEtages;
    }

    public void setM_inbEtages(int m_inbEtages) {
        this.m_inbEtages = m_inbEtages;
    }

    @Override
    public String toString() {
        return "Mall{" +
                "m_sMall='" + m_sMall + '\'' +
                ", m_id=" + m_id +
                ", m_sVille='" + m_sVille + '\'' +
                ", m_inbEtages=" + m_inbEtages +
                '}';
    }
}