
import './App.css';
import { Header } from './Header';
import { Footer } from './Footer';



function App() {
  const emailLink={ "mail" : 'ram@abc.com',"text":'Administrator'}
  return (
    <div className="App">
      <Header heading={'Raju Taxi Service'}></Header>
      <Footer designer={'Abc Limited'} email={emailLink}></Footer>
      
    </div>
     
  );
}

export default App;
