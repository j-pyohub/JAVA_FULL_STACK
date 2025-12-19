import Book from "./Book";
import BookEvent from "./BookEvent";
import UserFooter from "./UserFooter";
import UserHeader from "./UserHeader";

function BookContents() {
    const bookData = {name:"server book", price:150}; //서버 연결하면 객체로 넘어올 것
    const bookEventHangling = () => {
        //통신
        alert('외부에 통신하는 구현부');
    }
    return (
        <>
            <UserHeader />
            <div>책 이름 책 가격</div>
            <Book name="java" price={1000} />
            <Book name="python" price={2000} />
            <Book name="javascript" price={3000} />
            <br />
            <BookEvent bookObject={{name:'kim book', price:50}}
                clickHandling={() => {alert('book event 버튼')}}
            />
            {/* 입력값 바꿔서 쓰고 싶으면 제3의 공간에 넣어서 불러서 씀. or 혼자 쓴다면 따로 빼서 위에 const로 씀 */}
            <BookEvent bookObject={bookData}
                clickHandling={bookEventHangling}
            />
            <UserFooter />
        </>
    );
}
function BookApp() { //시작점: ~~App 등 나눈 것 어떻게 이름 지을지는 각자 선택 
    return (
        <>
            <BookContents />
        </>
    )
}
export default BookApp;