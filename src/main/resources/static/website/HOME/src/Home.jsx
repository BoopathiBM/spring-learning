import { Link } from 'react-router-dom'
import Header from './Header'
import Footer from './Footer'

function App() {

  return (
  <div>
      <Header/>
    <section id="home">
        <h2>Welcome to Spring Boot Learning</h2>
        <p>Your journey to mastering Spring Boot starts here.</p>
    </section>
    <div>
           <Link to="/Courses" class="btn">Start course</Link>
    </div>

    <section id="courses">
        <h2>Courses</h2>
        <p>Learn Spring Boot step by step with structured courses.</p>
        <div id="courses-container" class="course-grid">
        </div>
    </section>

    <section id="challenges">
        <h2>Coding Challenges</h2>
        <p>Test your Spring Boot skills with hands-on coding challenges.</p>
    </section>

    <section id="about">
        <h2>About Us</h2>
        <p>Learn more about our mission to teach Spring Boot.</p>
    </section>

    <section id="contact">
        <h2>Contact</h2>
        <p>Reach out to us for any queries or suggestions.</p>
    </section>

      <Footer/>
  </div>
  )
}

export default App
