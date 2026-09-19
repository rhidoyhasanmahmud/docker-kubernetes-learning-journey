# Learning Roadmap

Status legend: ✅ Complete · 🟡 In progress · ⬜ Planned

## Phase 1 — Docker Foundation

| # | Topic | Practical outcome | Status |
|---|---|---|---|
| 01 | Docker and Container fundamentals | Explain containers, VMs, namespaces, and cgroups using a Spring Boot example | ✅ |
| 02 | Images, layers, and Dockerfile | Build and inspect efficient images | ⬜ |
| 03 | Container lifecycle and commands | Create, start, stop, inspect, log, and remove containers | ⬜ |
| 04 | Volumes and bind mounts | Persist application and database data | ⬜ |
| 05 | Docker networking | Connect Spring Boot, PostgreSQL, and supporting services | ⬜ |
| 06 | Docker Compose | Run a multi-container application locally | ⬜ |
| 07 | Registries and image publishing | Tag and publish versioned images | ⬜ |
| 08 | Security and image optimization | Use non-root users, minimal images, and scanning | ⬜ |
| 09 | Debugging and troubleshooting | Diagnose logs, health, network, and resource issues | ⬜ |
| 10 | Spring Boot containerization project | Package a production-oriented service stack | ⬜ |

## Phase 2 — Kubernetes Foundation

| # | Topic | Practical outcome | Status |
|---|---|---|---|
| 01 | Architecture and core components | Explain control plane, nodes, and reconciliation | ⬜ |
| 02 | Pods and workloads | Run and inspect Pods, ReplicaSets, and Deployments | ⬜ |
| 03 | Services and cluster networking | Expose and connect workloads | ⬜ |
| 04 | ConfigMaps and Secrets | Externalize application configuration | ⬜ |
| 05 | Probes and resource management | Configure health checks, requests, and limits | ⬜ |
| 06 | Persistent storage | Use volumes, PVs, PVCs, and StorageClasses | ⬜ |
| 07 | Ingress | Route external traffic to services | ⬜ |
| 08 | Updates and scaling | Perform rollouts, rollbacks, and autoscaling | ⬜ |
| 09 | Observability and troubleshooting | Inspect events, logs, metrics, and failures | ⬜ |
| 10 | Helm and deployment packaging | Package and configure Kubernetes applications | ⬜ |
| 11 | Security fundamentals | Apply RBAC, security contexts, and least privilege | ⬜ |
| 12 | Spring Boot on Kubernetes project | Deploy and operate the service built in Phase 1 | ⬜ |

## Completion rule for each topic

A topic is marked complete only when it contains:

- [ ] Concept explained in my own words
- [ ] At least one practical command or runnable example
- [ ] A diagram or comparison where it improves understanding
- [ ] Common mistakes or troubleshooting notes
- [ ] Interview-focused summary
- [ ] Reviewed and published Markdown article
