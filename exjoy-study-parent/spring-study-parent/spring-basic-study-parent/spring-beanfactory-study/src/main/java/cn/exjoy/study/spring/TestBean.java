package cn.exjoy.study.spring;

public class TestBean {

    private MockBean mockBean;

    public MockBean getMockBean() {
        return mockBean;
    }

    public void setMockBean(MockBean mockBean) {
        this.mockBean = mockBean;
    }

    public void display() {
        System.out.println(mockBean);
    }
}
