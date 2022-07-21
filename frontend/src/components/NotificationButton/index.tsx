import axios from 'axios';
import { toast } from 'react-toastify';
import icon from '../../assets/img/notification-icon.svg';
import { BASE_URL } from '../../utils/request';
import './styles.css';

type Props = {
  saleId: number;
}

function handleClick(id :number) {
  console.log(id);
  axios.get(`${BASE_URL}/sales/10/notification`)
    .then(function () {
      toast.info("SMS enviado com sucesso");
    });
}

function NotificationButton( {saleId} : Props) {
  return (
    <div className="begameta-red-btn" onClick={() => handleClick(saleId)}>
      <img src={icon} alt="Notificar" />
    </div>
  )
}

export default NotificationButton;
