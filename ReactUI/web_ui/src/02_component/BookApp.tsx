import Book from "./Book";
import UserFooter from "./UserFooter";
import UserHeader from "./UserHeader";

function BookContents() {
    return (
        <>
            <UserHeader />
            <div>책 이름 책 가격</div>
            <Book name="java" price={1000} />
            <Book name="python" price={2000} />
            <Book name="javascript" price={3000} />
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