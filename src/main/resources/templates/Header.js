class Header extends HTMLElement {
  constructor() {
    super();
  }

  connectedCallback() {
    this.innerHTML = `
    <header>
        <nav class="navbar fixed-top navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" style="padding-left:50px" href="#">iCargo Demo</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
        <li class="nav-item">
        <a class="nav-link" href="#">Maintain Booking</a>
        </li>
        <li class="nav-item">
        <a class="nav-link" href="#">AWB Execution</a>
        </li>
        <li class="nav-item">
        <a class="nav-link" href="#">AWB Acceptance</a>
        </li>
        <li class="nav-item">
        <a class="nav-link" href="#">Export Manifest</a>
        </li>
        <li class="nav-item">
        <a class="nav-link" href="#">Flight Arrival</a>
        </li>
        
        </ul>
        </div>
        </nav>
        </header>
    
      
    `;
  }
}

customElements.define('header-component', Header);