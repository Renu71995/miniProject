class Footer extends HTMLElement {
  constructor() {
    super();
  }

  connectedCallback() {
    this.innerHTML = `
      <footer>
        <nav class="navbar fixed-bottom navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand mx-auto" href="#"> © Copyright 2021 iCargo Demo</a>
        </nav>
        </footer> 
    `;
  }
}

customElements.define('footer-component', Footer);