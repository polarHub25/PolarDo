import logo from './logo.svg';
import './App.css';
import React, {useState, useEffect} from 'react';
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import Header from './routes/Header';
import Footer from './routes/Footer';
import Home from './routes/Home';

function App() {

const [message, setMessage] = useState([]);
useEffect(()=>{
   
},[]);

  return (
    <div className="App">
      <Router>
        <Header

        />
      <hr />
      <Routes>
        <Route path="/" 
        element={
          <Home/>
        }
        />
      </Routes>
      <hr />
      <Footer />
      </Router>
      
    </div>
  );
}

export default App;
