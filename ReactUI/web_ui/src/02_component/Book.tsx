export default function Book(props : {name:string; price:number}) { //중복되는 이름/가격이라면, book으로 한정하지말고 item 등으로 범용적으로 짓는게 낫다.
    return (<div>
        {props.name}    {props.price}
    </div>)
}