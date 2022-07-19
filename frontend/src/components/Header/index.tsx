import logo from '../../assets/img/logo.svg'
import './styles.css'

function Header() {
    return (
        <header>
        <div className="begameta-logo-container">
            <img src={logo} alt="BEGAMeta" />
            <h1>BEGAMeta</h1>
            <p>Desenvolvido por 
                <a href="https://github.com/brunoelinton/">@brunoelinton</a>
            </p>
        </div>
    </header>
    )
  }
  
  export default Header