public class OrderService {
    //2) final

    private final OrderRepository orderRepository = new OrderRepository();
    //서비스 계층 -4
    //비즈니스 로직 수행 및 데이터 베이스의 대한 리소스를 관리한다.


    public String order (OrderDTO orderDTO){ //매개변수 잘 입력하기
        if(!orderDTO.getMenuName().equals("아메리카노")){
            return "주문 실패";
        }
        if(orderDTO.getPrice()<=0){
            return "땅파서 장사하나?";
        }
        String result =  orderRepository.order(orderDTO);

        return result;
    }

    public String orderDetail (OrderDTO orderDTO){
        if(!orderDTO.getMenuName().equals("아메리카노")){
            return "조회실패";
        }
        String view = orderRepository.orderDetail();
        return view;
    }

    public String orderRead (OrderDTO orderDTO){
        ArrayList menuList = orderRepository.orderRead();
        return menuList;


    }

    public ArrayList orderRead(){
        ArrayList menuList = orderRepository.orderRead();
        return menuList;
    }

}