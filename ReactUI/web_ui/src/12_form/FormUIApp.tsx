import  { useState, type ChangeEvent} from "react";
function FormUIApp(){
    const [name, setName] = useState("");
    const [ gender, setGender] = useState("남자"); //
    const handleChangeName = (event :ChangeEvent<HTMLInputElement>) =>{
        setName(event.target.value);
    };
    const handleChangeGender = (event :ChangeEvent<HTMLSelectElement>) =>{             //
        setGender(event.target.value);
    };
    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) =>{
        alert(` name : ${name},  gender :${gender}`);  //
        event.preventDefault();  //기본 동작 방지
    };
    return(
        <form onSubmit={handleSubmit}>
            name<input type="text" value={name} onChange={handleChangeName} />
            <br />
            gender :
            <select value={gender} onChange={handleChangeGender}>            //
                <option value="M">남자</option>
                <option value="F">여자</option>
            </select>
            <br />
            <button type="submit">제출</button>            
        </form>
    );
}
export default FormUIApp;