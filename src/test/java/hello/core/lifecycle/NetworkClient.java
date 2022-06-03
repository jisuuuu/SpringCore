package hello.core.lifecycle;

public class NetworkClient {

    private String url;

    public NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //서비스 시작 시 호출
    public void connect() {
        System.out.println("connect : " + url);
    }

    public void call(String message) {
        System.out.println("call : "+ url + "message = " + message);
    }

    //서비스 종료 시 호출
    public void disconnect() {
        System.out.println("close : " + url);
    }

    //properties 가 끝나면, 의존 관계가 끝나면, 거의 사용하지 않음 왜냐면 더 좋은 방법 존재
    public void init() throws Exception {
        System.out.println("NetworkClient.init");
        connect();
        call("초기화 연결 메세지");
    }

    public void close() throws Exception {
        System.out.println("NetworkClient.close");
        disconnect();
    }
}
