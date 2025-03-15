import React from 'react'
import { Link } from 'react-router-dom'

function Header() {
  return (
    <div>
            <header>
        <h1>Spring Boot Learning</h1>
        <nav>
            <ul>
                <li><Link className='home' to="/">Home</Link></li>
                <li><Link className='home' to="#courses">Courses</Link></li>
                <li><Link className='home' to="#challenges">Challenges</Link></li>
                <li><Link className='home' to="#about">About</Link></li>
                <li><Link className='home' to="#contact">Contact</Link></li>
            </ul>
        </nav>
    </header>
    </div>
  )
}

export default Header