function BookEvent({bookObject, clickHandling} : 
    {bookObject : {name : string, price : number};
     clickHandling : () => void}
) {
//아래처럼 onClick보다는 훅으로 만들어 쓰는 게 좋음
    return (<div>
        <h1> 책 {bookObject.name} 가격 {bookObject.price}</h1>
        <button onClick={clickHandling}>책 구매 이벤트</button>
    </div>);
};
export default BookEvent;